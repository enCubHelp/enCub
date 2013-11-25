using System;
using System.Text;
using System.Security.Cryptography;

namespace Common.Util
{
    public static class Decription
    {
        public static string DecryptString(string Message, string Passphrase)
        {
            byte[] Results;
            System.Text.UTF8Encoding UTF8 = new System.Text.UTF8Encoding();
            MD5CryptoServiceProvider HashProvider = new MD5CryptoServiceProvider();
            byte[] TDESKey = HashProvider.ComputeHash(UTF8.GetBytes(Passphrase));
            // Step 2. TripleDESCryptoServiceProvider object 생성
            TripleDESCryptoServiceProvider TDESAlgorithm = new TripleDESCryptoServiceProvider();
            // Step 3. Decoder 설정
            TDESAlgorithm.Key = TDESKey;
            TDESAlgorithm.Mode = CipherMode.ECB;
            TDESAlgorithm.Padding = PaddingMode.PKCS7;
            // Step 4. 인자로 받은 문자열을 Byte[]로 변환
            byte[] DataToDecrypt = Convert.FromBase64String(Message);
            // Step 5. 실제 문자열 복호화
            try
            {
                ICryptoTransform Decryptor = TDESAlgorithm.CreateDecryptor();
                Results = Decryptor.TransformFinalBlock(DataToDecrypt, 0, DataToDecrypt.Length);
            }
            finally
            {
                // 중요한 3DES, Hashprovider의 속성을 해제
                TDESAlgorithm.Clear();
                HashProvider.Clear();
            }
            // Step 6. UTF-8 형태로 복호화된 문자열 리턴
            return UTF8.GetString( Results );
        }
    }
}
