
package standardscala
import org.apache.spark.sql.catalyst
import org.apache.spark.SparkContext
import org.apache.spark.sql

object ParallelCollections extends App {
  val a = Array(4,2,7,3,9,1)
  println(a.foldLeft(0)((s,i)=>s+i))
  println(a.foldLeft(0)(_+_))
  //the foldleft does (((((0+4)+2)+7)+3)+9)+1 while foldrigh t is the viceversa

}
