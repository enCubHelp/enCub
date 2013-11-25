using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using System.IO;

namespace Salt.enCub
{
    public partial class enCubImportFile : Form
    {
        private Common.Util.SystemIcon _sysIcon = new Common.Util.SystemIcon();
        private List<String> _selectedFiles = new List<String>();
        private List<int> _seletedFileSizes = new List<int>();
        public enCubImportFile()
        {
            InitializeComponent();
            InitializeMenu();
        }
        public void InitializeMenu()
        {
            this.StartPosition = FormStartPosition.CenterScreen;
            this.AcceptButton = this._confirmButton;

            String _fullPath = "";
            foreach (DriveInfo drv in DriveInfo.GetDrives())
            {
                if (!Directory.Exists(drv.Name))
                {
                    continue;
                }
                TreeNode _childNode = new TreeNode(drv.Name);
                DirectoryInfo _dirInfo = new DirectoryInfo(drv.Name);
                _fullPath = drv.Name;
                GetDirectoryNodes(_fullPath, _childNode, _dirInfo);
                this._directoryView.Nodes.Add(_childNode);
                this._directoryView.Nodes[this._directoryView.Nodes.Count - 1].ImageIndex = _sysIcon.GetIconIndex(drv.Name);
            }
            this._directoryView.ImageList = _sysIcon.SmallIconsImageList;
            this._fileView.Columns.Add("File Name", 100, HorizontalAlignment.Left);
            this._fileView.Columns.Add("Size", 100, HorizontalAlignment.Left);
            this._fileView.Columns.Add("Last Accessed", 200, HorizontalAlignment.Left);
            this._icon.Items.Clear();
            this._icon.Items.Add("Detail");
            this._icon.Items.Add("Small Icon");
            this._icon.Items.Add("Large Icon");
            this._icon.Items.Add("Title");
            this._icon.Items.Add("List");
            this._icon.SelectedIndex = 0;
        }
        private void GetDirectoryNodes(String parmPath, TreeNode root, DirectoryInfo dirs)
        {
            try
            {
                DirectoryInfo[] _DIRS = dirs.GetDirectories();
                foreach (DirectoryInfo _dir in _DIRS)
                {
                    if (_dir.Name.ToUpper().Equals("CONFIG.MSI") ||
                        _dir.Name.ToUpper().Equals("WINDOWS") ||
                        _dir.Name.ToUpper().Equals("PROGRAM FILES") ||
                        _dir.Name.ToUpper().Equals("SYSTEM VOLUME INFORMATION") ||
                        _dir.Name.ToUpper().Equals("RECYCLER") ||
                        _dir.Name.ToUpper().Equals("DOCUMENTS AND SETTINGS"))
                    {
                        continue;
                    }
                    TreeNode _child = new TreeNode(_dir.Name);
                    _child.ImageIndex = _sysIcon.GetIconIndex(parmPath + _dir.Name);
                    root.Nodes.Add(_child);
                }
            }
            catch (Exception e)
            {
                String _temp = e.ToString();
                Common.Util.LOG.WriteLOG("Error=[" + e.ToString() + "]");
            }
        }
        private void GetFileLists(String parmPath)
        {
            ListViewItem _item;
            ListViewItem.ListViewSubItem _subItem;

            this._fileView.Items.Clear();

            DirectoryInfo _dir = new DirectoryInfo(parmPath);
            DirectoryInfo[] _directoryLists = _dir.GetDirectories();
            for (int loopIndex = 0; loopIndex < _directoryLists.Length; loopIndex++)
            {
                if (_directoryLists[loopIndex].Name.ToUpper().Equals("CONFIG.MSI") ||
                    _directoryLists[loopIndex].Name.ToUpper().Equals("WINDOWS") ||
                    _directoryLists[loopIndex].Name.ToUpper().Equals("PROGRAM FILES") ||
                    _directoryLists[loopIndex].Name.ToUpper().Equals("SYSTEM VOLUME INFORMATION") ||
                    _directoryLists[loopIndex].Name.ToUpper().Equals("RECYCLER") ||
                    _directoryLists[loopIndex].Name.ToUpper().Equals("DOCUMENTS AND SETTINGS"))
                {
                    continue;
                }
                _item = new ListViewItem();
                _item.Text = _directoryLists[loopIndex].Name;
                _item.Tag = _directoryLists[loopIndex].FullName;

                _subItem = new ListViewItem.ListViewSubItem();
                _subItem.Text = "";
                _item.SubItems.Add(_subItem);

                _subItem = new ListViewItem.ListViewSubItem();
                _subItem.Text = _directoryLists[loopIndex].LastAccessTime.ToString();
                _item.SubItems.Add(_subItem);
                _item.ImageIndex = _sysIcon.GetIconIndex(_directoryLists[loopIndex].FullName);

                this._fileView.Items.Add(_item);
            }

            FileInfo[] _files = _dir.GetFiles();
            for (int loopIndex = 0; loopIndex < _files.Length; loopIndex++)
            {
                _item = new ListViewItem();
                _item.Text = _files[loopIndex].Name;
                _item.Tag = _files[loopIndex].FullName;

                _subItem = new ListViewItem.ListViewSubItem();
                _subItem.Text = _files[loopIndex].Length.ToString();
                _item.SubItems.Add(_subItem);

                _subItem = new ListViewItem.ListViewSubItem();
                _subItem.Text = _files[loopIndex].LastAccessTime.ToString();
                _item.SubItems.Add(_subItem);
                _item.ImageIndex = _sysIcon.GetIconIndex(_files[loopIndex].FullName);

                this._fileView.Items.Add(_item);
            }
            this._fileView.View = View.Details;
            this._fileView.SmallImageList = _sysIcon.SmallIconsImageList;
            this._fileView.LargeImageList = _sysIcon.LargeIconsImageList;
        }

        private void _directoryView_AfterSelect(object sender, TreeViewEventArgs e)
        {
            if (((TreeView)sender).SelectedNode.Nodes.Count == 0)
            {
                DirectoryInfo _dirInfo = new DirectoryInfo(((TreeView)sender).SelectedNode.FullPath.ToString());
                GetDirectoryNodes(((TreeView)sender).SelectedNode.FullPath.ToString(), ((TreeView)sender).SelectedNode, _dirInfo);
                this._directoryView.Nodes[this._directoryView.Nodes.Count - 1].ImageIndex = _sysIcon.GetIconIndex(((TreeView)sender).SelectedNode.FullPath.ToString());
            }
            if (Directory.Exists(((TreeView)sender).SelectedNode.FullPath.ToString()))
            {
                GetFileLists(((TreeView)sender).SelectedNode.FullPath.ToString());
                this._file.Text = ((TreeView)sender).SelectedNode.FullPath.ToString();
                if (this._file.Text.IndexOf(@"\\") >= 0)
                {
                    String _tempAddress = this._file.Text.Substring(0, this._file.Text.IndexOf(@"\\")) + this._file.Text.Substring(this._file.Text.IndexOf(@"\\") + 1);
                    this._file.Text = _tempAddress;
                }
                this._selectAll.Checked = false;
            }
            else
            {
                MessageBox.Show("Drive[" + ((TreeView)sender).SelectedNode.FullPath.ToString() + "]가 존재하지 않거나 접근할 수 없습니다.", "오류");
            }
        }

        private void _icon_SelectedIndexChanged(object sender, EventArgs e)
        {
            switch (((ComboBox)sender).SelectedItem.ToString())
            {
                case "Title":
                    this._fileView.View = View.Tile;
                    break;
                case "Small Icon":
                    this._fileView.View = View.SmallIcon;
                    break;
                case "Large Icon":
                    this._fileView.View = View.LargeIcon;
                    break;
                case "List":
                    this._fileView.View = View.List;
                    break;
                case "Detail":
                    this._fileView.View = View.Details;
                    break;
            }
        }

        private void _selectAll_CheckedChanged(object sender, EventArgs e)
        {
            if (((CheckBox)sender).Checked)
            {
                for (int loopIndex = 0; loopIndex < _fileView.Items.Count; loopIndex++)
                {
                    if (!Directory.Exists(this._directoryView.SelectedNode.Text + "\\" + this._fileView.Items[loopIndex].Text))
                    {
                        this._fileView.Items[loopIndex].Selected = true;
                    }
                }
            }
            else
            {
                for (int loopIndex = 0; loopIndex < _fileView.Items.Count; loopIndex++)
                {
                    this._fileView.Items[loopIndex].Selected = false;
                }
            }
            this._fileView.Focus();
        }

        private void _cancelButton_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private void _confirmButton_Click(object sender, EventArgs e)
        {
            _selectedFiles.Clear();
            for (int loopIndex = 0; loopIndex < this._fileView.SelectedItems.Count; loopIndex++)
            {
                _selectedFiles.Add(this._fileView.SelectedItems[loopIndex].Text);
                int _fileSize = 0;
                if (int.TryParse(this._fileView.SelectedItems[loopIndex].SubItems[1].Text, out _fileSize))
                {
                    _seletedFileSizes.Add(_fileSize);
                }
                else
                {
                    _seletedFileSizes.Add(0);
                }
            }
            if (_selectedFiles.Count > 0)
            {
                this.DialogResult = DialogResult.OK;
                this.Close();
            }
            else
            {
                MessageBox.Show("파일을 선택하십시오.");
            }
        }
        public List<String> GetSelectedFiles()
        {
            return _selectedFiles;
        }
        public List<int> GetSelectedFileSizes()
        {
            return _seletedFileSizes;
        }
        public String GetPath()
        {
            return this._file.Text;
        }
    }
}
