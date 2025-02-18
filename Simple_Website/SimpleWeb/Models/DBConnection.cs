using MySql.Data.MySqlClient;

namespace SimpleWeb.Models
{
	public class DBConnection
	{
		private DBConnection()
		{

		}

		public String Server { get; set; }
		public string DatabaseName { get; set; }
		public string Username { get; set; }
		public string Password { get; set; }

		public MySqlConnection Connection { get; set; }

		private static DBConnection _instance = null;
		public static DBConnection Instance() {
			if (_instance == null)
				_instance = new DBConnection();
			return _instance;
		}

		public bool IsConnect() {
			if (Connection == null) {
				if (String.IsNullOrEmpty(DatabaseName))
					return false;
				string connString = string.Format("Server=127.0.0.1;uid=root;pwd=root;database=simpleweb");
				Connection = new MySqlConnection(connString);
				Connection.Open();
			}
			return true;
		}

		public void close() {
			Connection.Close();
		}
	}
}
