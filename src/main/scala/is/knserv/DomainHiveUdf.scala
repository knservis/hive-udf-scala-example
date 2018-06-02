package is.knserv

import org.apache.hadoop.hive.ql.exec.UDF
import java.net.URI

class DomainHiveUdf extends UDF {
  def evaluate(str: String): String ={ 
    (new URI(str)).getHost()
  }
}
