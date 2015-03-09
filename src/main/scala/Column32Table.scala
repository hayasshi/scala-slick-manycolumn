import scala.slick.driver.JdbcDriver.simple._
import scala.slick.lifted.Tag
import scala.slick.collection.heterogenous._
import scala.slick.collection.heterogenous.syntax._

class Column32Table(tag: Tag) extends Table[Column32](tag, "many_column32") {
  def column1 = column[Long]("column1", O.PrimaryKey, O.AutoInc)
  def column2 = column[Boolean]("column2")
  def column3 = column[Boolean]("column3")
  def column4 = column[String]("column4")
  def column5 = column[String]("column5")
  def column6 = column[String]("column6")
  def column7 = column[String]("column7")
  def column8 = column[String]("column8")
  def column9 = column[String]("column9")
  def column10 = column[String]("column10")
  def column11 = column[String]("column11")
  def column12 = column[String]("column12")
  def column13 = column[String]("column13")
  def column14 = column[String]("column14")
  def column15 = column[String]("column15")
  def column16 = column[String]("column16")
  def column17 = column[String]("column17")
  def column18 = column[String]("column18")
  def column19 = column[String]("column19")
  def column20 = column[String]("column20")
  def column21 = column[String]("column21")
  def column22 = column[String]("column22")
  def column23 = column[String]("column23")
  def column24 = column[String]("column24")
  def column25 = column[String]("column25")
  def column26 = column[String]("column26")
  def column27 = column[String]("column27")
  def column28 = column[String]("column28")
  def column29 = column[String]("column29")
  def column30 = column[Option[String]]("column30")
  def column31 = column[java.sql.Timestamp]("column31")
  def column32 = column[Option[java.sql.Timestamp]]("column32")

  def * = {
    (column1 :: column2 :: column3 :: column4 :: column5 :: column6 :: column7 :: column8 :: column9 :: column10 :: column11 :: column12 :: column13 :: column14 :: column15 :: column16 :: column17 :: column18 :: column19 :: column20 :: column21 :: column22 :: column23 :: column24 :: column25 :: column26 :: column27 :: column28 :: column29 :: column30 :: column31 :: column32 :: HNil).shaped <> (
      { case x => Column32(x(0), x(1), x(2), x(3), x(4), x(5), x(6), x(7), x(8), x(9), x(10), x(11), x(12), x(13), x(14), x(15), x(16), x(17), x(18), x(19), x(20), x(21), x(22), x(23), x(24), x(25), x(26), x(27), x(28), x(29), x(30), x(31)) }
      , { x: Column32 => Option((x.column1 :: x.column2 :: x.column3 :: x.column4 :: x.column5 :: x.column6 :: x.column7 :: x.column8 :: x.column9 :: x.column10 :: x.column11 :: x.column12 :: x.column13 :: x.column14 :: x.column15 :: x.column16 :: x.column17 :: x.column18 :: x.column19 :: x.column20 :: x.column21 :: x.column22 :: x.column23 :: x.column24 :: x.column25 :: x.column26 :: x.column27 :: x.column28 :: x.column29 :: x.column30 :: x.column31 :: x.column32 :: HNil)) }
    )
  }
}

object Column32Table {
  val query = TableQuery[Column32Table]
}
