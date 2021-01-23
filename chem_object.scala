package chem_folder

import elementMap.elementDict

object chem_object extends App {

  class Element(val atomicSymbol:String) {

    override def toString:String = {

      val myElements = new elementDict

      if (myElements.elements.contains(atomicSymbol)) myElements.elements(atomicSymbol)

      else s"$atomicSymbol not in element dictionary"
    }
  }

   object ElementList {

      def apply(element:Element):List[Element] = List(element)

   }
  class addElement {
     def addToList(element:Element, elementList:List[Element]):List[Element] = {

       val myElements = new elementDict

       if (myElements.elements.contains(element.atomicSymbol)) element :: elementList

       else elementList

    }
  }
}
