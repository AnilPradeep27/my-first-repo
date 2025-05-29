package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.sql.Types;

import com.pg.coinarcadeservice.db.types.CoinTransactionData;
import com.pg.framework.jdbc.Array;
import com.pg.framework.jdbc.DatabaseException;
import com.pg.framework.jdbc.JDBCFramework;
import com.pg.framework.jdbc.JDBCFrameworkFactory;
import com.pg.framework.jdbc.ProcedureExecutor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProcedureTest {

	 public static void main(String[] args) throws DatabaseException {
		 
		  ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_CoinArcadeService.xml");
		  JDBCFramework jdbcFramework = (JDBCFramework) context.getBean("casJDBCFramework");
	        // Replace these with your actual database connection details
	        String dbUrl = "jdbc:oracle:thin:@10.1.182.172:1521:real";
	        String dbUser = "pcasino_app";
	        String dbPassword = "pcasino_app";

	        // Initialize database connection
	        try (Connection connection = DriverManager.getConnection(dbUrl, dbUser, dbPassword)) {
	            // Create ProcedureExecutor (adjust to your framework or environment)
	        	
	        	ProcedureExecutor pExec = jdbcFramework.getProcedureExecutor("PKG_COIN_INTEGRATION.p_validate_txn");
	        	
	            // Set the input parameter for the procedure (the array of CoinTransactionData)
	            List<CoinTransactionData> coinTxns = getCoinTransactionData(); // Define this method to get your data
	            pExec.setArray(1, new Array(coinTxns, "tab_coin_txn_data"));

	            // Register the output parameters
	            pExec.registerOutput(2, Types.INTEGER);  // For integer output
	            pExec.registerOutput(3, Types.VARCHAR); // For string output
	            pExec.registerOutput(4, CoinTransactionData.class); // For your custom class output

	            // Execute the procedure and get results
	            Map resultMap = pExec.execute();

	            // Process the resultMap (assuming it contains the outputs)
	            if (resultMap != null) {
	                int resultCode = (int) resultMap.get(2); // Output 2: Result code (integer)
	                String resultMessage = (String) resultMap.get(3); // Output 3: Result message (string)
	                CoinTransactionData resultData = (CoinTransactionData) resultMap.get(4); // Output 4: CoinTransactionData

	                // Print the results
	                System.out.println("Result Code: " + resultCode);
	                System.out.println("Result Message: " + resultMessage);
	                System.out.println("Result Data: " + resultData); // This assumes a toString() method is overridden in CoinTransactionData
	            } else {
	                System.out.println("No result from procedure execution.");
	            }

	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	 
	 private static List<CoinTransactionData> getCoinTransactionData() {
	        // Replace this with actual data from your use case
		 CoinTransactionData txn1 = new CoinTransactionData();
		 List<CoinTransactionData> coinTxns = new ArrayList<CoinTransactionData>();

		 txn1.setAccountName("fb_fbE6bq146204");
		 txn1.setVendorTableTypeId(null);
		 txn1.setTableTypeId(15406);
		 txn1.setGameSequenceId(0);
		 txn1.setTransactionType("bet");
		 txn1.setTableId(0);
		 txn1.setCoinType(null);
		 txn1.setInvokerProduct("CASINO");
		 txn1.setBrand("FOXYBINGO");
		 txn1.setFrontEndId(null);
		 txn1.setChannel("FC");
		 txn1.setGameRoundId("GVF454605111");
		 txn1.setGameStatus("INPROGRESS");
		 txn1.setVendorTxnId("GVF454605111-STK");
		 txn1.setCoins(10);
		 txn1.setVendorSubTxnId("GVF454605111-STK");
		 txn1.setTxnStatus("pending");
		 txn1.setSubTxnStatus("pending");
		 txn1.setTxnTime(null);
		 txn1.setInsertDate(null);
		 txn1.setUpdateDate(null);
		 txn1.setLoyalityRefId(null);
		 txn1.setVendorId(null);
		 txn1.setIp(null);
		 txn1.setErrorCode(0);
		 txn1.setErrorMessage(null);
		 txn1.setTxnSequence(0);
		 txn1.setGtId(null);
		 txn1.setRetryCount(0);
		 txn1.setCustomParam1(null);
		 txn1.setCustomParam2(null);
		 txn1.setCustomParam3(null);

	      
	       
	        return coinTxns;
	    }


}
