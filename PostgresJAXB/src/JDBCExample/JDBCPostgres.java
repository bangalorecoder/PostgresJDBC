package JDBCExample;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import org.postgresql.jdbc.PgResultSet;

import modal.Company;

/**
 * @author Amit Kumar
 * Note: Code is intensionally kept minimum, in the single class, without refatored methods for fast reference. 
 * Please design and refactor the code based on your requirements. 
 */

public class JDBCPostgres {

	
		public static void main(String[] argv) {

		try {
				Class.forName("org.postgresql.Driver");
			} 
		catch (ClassNotFoundException e) {

			System.out.println("PostgreSQL JDBC Driver missing from the build path");
			e.printStackTrace();
			return;
			}

	      System.out.println("PostgreSQL JDBC Driver Registered!");

		  Connection connection = null;
		  //This map is going to be populated with all the records. 
		  
		  HashMap<Integer, Company> companyTableMap= new HashMap<Integer, Company>();

			try {
				connection = DriverManager.getConnection(
						"jdbc:postgresql://127.0.0.1:5432/postgres", "postgres",
						"admin");
				if (connection != null) {
					System.out.println("Connection has been established successfully");
					
					PgResultSet rs =(PgResultSet) connection.prepareStatement("SELECT * FROM COMPANY").executeQuery();
					
					while(rs.next()){
						Company comp = new Company();
						comp.setName(rs.getString("NAME"));
						//comp.setAddress((rs.getString("ADDRESS").toCharArray());
						comp.setAge(rs.getInt("AGE"));
						comp.setJoinDate(rs.getDate("JOIN_DATE"));
						comp.setSalary(rs.getFloat("SALARY"));
						companyTableMap.put(rs.getInt("ID"), comp);
					}
					System.out.println("COntent of the HashMap: "+companyTableMap.toString());
					connection.close();
				}
				
			} catch (SQLException e) {
				System.out.println("Connection Failed! Check output console");
				e.printStackTrace();
				return;
			}
			
		}

	}


