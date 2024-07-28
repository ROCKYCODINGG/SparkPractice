import org.apache.spark.sql.SparkSession

object SparkFunction{
  def sparkInitialization(appName: String): SparkSession = {
    val spark = SparkSession.builder().master("local").appName(appName
    ).getOrCreate()

    spark
  }

}