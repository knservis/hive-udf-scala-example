package is.knserv

import org.apache.hadoop.hive.ql.exec.UDF

class ScalaHiveUdf extends UDF {
  def evaluate(str: String): String ={ 
    str.trim
  }
}
