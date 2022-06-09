package com.ledis.test

import scala.collection.mutable

object Test {
	
	def main(args: Array[String]): Unit = {
		val map = new mutable.HashMap[String,Int]()
		map.put("sandee", 1)
		map.put("wsd", 2)
		map.put("lollipop", 3)
		map.put("mxd", 4)
		for (elem <- map) {
			println(elem)
		}
		map transform {
			(x,y) => {
				if(x.equals("lollipop")){
					-1
				}else{
					y
				}
			}
		}
		for (elem <- map) {
			println(elem)
		}
	}
}
