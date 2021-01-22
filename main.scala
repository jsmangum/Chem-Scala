package chem_folder

import chem_object.Element
import chem_object.ElementList
import chem_object.addElement

import scala.annotation.tailrec

object main extends App {

  val be = new Element("Be")
  val k = new Element("K")
  val li = new Element("Li")
  val xe = new Element("Xe")

  val x_list =  ElementList(be)

  println(x_list)

  val x = new addElement

  val r = x.addToList(k,x_list)

  println(r)
  val s = x.addToList(li,r)
  val s1 = x.addToList(xe,s)
  println(s1)
  println("")


}
