package practice3;

//has a relationship, association

public class engine {

}

class car { //extends not used, thus only few properties can be used thorugh e, classes are not tightly coupled
	//non blood relatonshio
	
	//car has a engine
	engine e= new engine(); //has a relationship bw classses achieved using new keyword
}

//two types of has a relationship
//aggregation: weak bond
//composition: strong bond