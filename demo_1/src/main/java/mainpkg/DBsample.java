package mainpkg;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import db_connection.JDBC_Connection;

public class DBsample {

	Connection con;
	 
	 public DBsample()
	 {
		 con= JDBC_Connection.db();
		 
	 }
	 
	 void insert(int id,String name,String mob)
	 {
		 try
		 {
			 PreparedStatement pd =con.prepareStatement("insert into student(id,name,mob)"+"values(?,?,?,)");
			 pd.setInt(1,id);
			 pd.setString(2,name);
			 pd.setString(3, mob);
		
			 
			 
			 int i = pd.executeUpdate();

				if (i > 0) {
					System.out.println("Successfully Inserted");
					// response.sendRedirect("/Login.html");
				}
			} catch (Exception e) {
				System.out.println(e);
			}
		}

			void select(int id) {
				try {
					PreparedStatement pd = con.prepareStatement("select * from student where id = '"+id+"' ");
					ResultSet rs = pd.executeQuery();

					while (rs.next()) {
					 
				
						String name1 = rs.getString(2);
												
						//String email = rs.getString(3);
						System.out.println("Values Are::" + name1);

					}

					
					
					 

				} catch (Exception e) {
					System.out.println( e);
				}

			}


	

	 }

