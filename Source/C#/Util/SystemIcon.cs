using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using System.Runtime.InteropServices;
using System.IO;
using System.Drawing;

namespace Common.Util
{
    public class SystemIcon : IDisposable
    {
        private const uint SHGFI_ICON = 0x100;
        private const uint SHGFI_LARGEICON = 0x0;
        private const uint SHGFI_SMALLICON = 0x1;

        private ImageList _smallImageList = new ImageList();
        private ImageList _largeImageList = new ImageList();
        private bool _disposed = false;

        private void CleanUp(bool disposing)
        {
            if (!this._disposed)
            {
                if (disposing)
                {
                    _smallImageList.Dispose();
                    _largeImageList.Dispose();
                }
            }
            _disposed = true;
        }
        public void Dispose()
        {
            CleanUp(true);
            GC.SuppressFinalize(this);
        }
        public ImageList SmallIconsImageList
        {
            get { return _smallImageList; }
        }
        public ImageList LargeIconsImageList
        {
            get { return _largeImageList; }
        }
        public int Count
        {
            get { return _smallImageList.Images.Count; }
        }
        public int GetIconIndex(string FileName)
        {
            Win32API.SHFILEINFO shinfo = new Win32API.SHFILEINFO();

            FileInfo info = new FileInfo(FileName);

            string ext = info.Extension;
            if (String.IsNullOrEmpty(ext))
            {
                if ((info.Attributes & FileAttributes.Directory) != 0)
                {
                    ext = "5EEB255733234c4dBECF9A128E896A1E"; // for directories
                }
                else
                {
                    ext = "F9EB930C78D2477c80A51945D505E9C4"; // for files without extension
                }
            }
            else
            {
                if (ext.Equals(".exe", StringComparison.InvariantCultureIgnoreCase) ||
                    ext.Equals(".lnk", StringComparison.InvariantCultureIgnoreCase))
                {
                    ext = info.Name;
                }
            }

            if (_smallImageList.Images.ContainsKey(ext))
            {
                return _smallImageList.Images.IndexOfKey(ext);
            }
            else
            {
                Win32API.SHGetFileInfo(FileName, 0, ref shinfo, (uint)Marshal.SizeOf(shinfo), SHGFI_ICON | SHGFI_SMALLICON);
                Icon smallIcon;
                try
                {
                    smallIcon = Icon.FromHandle(shinfo.hIcon);
                }
                catch (ArgumentException ex)
                {
                    if (_smallImageList.Images.ContainsKey(".txt"))
                    {
                        return _smallImageList.Images.IndexOfKey(ext);
                    }
                    else
                    {
                        return 0;
                    }
                    throw new ArgumentException(String.Format("File \"{0}\" doesn not exist!", FileName), ex);
                }
                _smallImageList.Images.Add(ext, smallIcon);

                Win32API.SHGetFileInfo(FileName, 0, ref shinfo, (uint)Marshal.SizeOf(shinfo), SHGFI_ICON | SHGFI_LARGEICON);
                Icon largeIcon = Icon.FromHandle(shinfo.hIcon);
                _largeImageList.Images.Add(ext, largeIcon);

                return _smallImageList.Images.Count - 1;
            }
        }
    }
}
