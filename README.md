# Collection of algorithms

## **Is it useful?**

Well, probably **yes**, but we don't know for sure :)
Here we have or at least should have a set of custom algos and different programming problem solutions.
It is a good place to contribute your problems and the way you solve them.

## **Languages**

Any limitations on that.
Currently supported :

 - ***Python***
 - ***Java***

You welcome to start your own stream.

## **Contributing**

Anyone is allowed to contribute. Even more - we ask you to share your problems with us. 
Also you are welcome to discuss solutions and improve them.

## **Packaging**

Few words about project structure we currently support. Basically we support just a tree of folders/packages with problems.
The naming approach looks like this :
***language*** -> ***datastructure*** -> ***resource*** -> ***exact_problem*** -> ***classes_with_code***

Java example :

    java/array/geeks_for_geeks/binary_search/BinarySearch.java


 - java - is root element, which maps on **language**.
 - array - maps on **datastructure**.
 - geeks_for_geeks - maps on **resource**, which indicates where from the original problem was taken. If there isn't any resource just use custom package.
 - binary_search - maps on **exact_problem**, as far as there can be multiple approaches or solutions the exact problem should be a package so that it can contain multiple files.
 - BinarySearch.java - maps on **classes_with_code**, that's one unit of solution among others possible.

## **Idealogy**

Programming is all about solving problems, isn't it?
We prefer saying Software developer - not Ruby developer, IOS developer, full-stack developer.
Any language/platform specific stuff - is just an area of development you are currently in. 
That's the kind of area were you feel yourself most comfortable in comparison to other areas.
We think that there are a lot of common problems and ofcoure solutions that aren't binded to languages or platforms.
A good developer should have basic knowledge and the ability to solve problems independent of language he/she is using.
At this point algos should join the game :) 
**Definetely you can contribute any language/platform specific problem. Don't treat our word as rule - we aren't forcing you to handle only abstract things.**
We are forcing to enchant your way of **thinking** in the algo approach/direction.
We don't mind that a lot of problems are already solved and optimized. We don't pretend to develop our super-zip algo and found ["Pied Piper".](https://en.wikipedia.org/wiki/Silicon_Valley_%28TV_series%29)
Everything we want - solve problems and help others to do that. 
This project is about helping people to decrease threshold entry into algos.

## **Future plans**

 - Add unit tests with different cases for each problem. So that we can handle all edge cases and stressfull things.  

## **Where to start?**

Have a look at those :

 - [Leetcode](https://leetcode.com/)
 - [GeeksForGeeks](http://www.geeksforgeeks.org/)
 - [Hacker Rank](https://www.hackerrank.com)

We'll add more links later.

## **Project Stage**

Currently it is a kind of [PoC](https://en.wikipedia.org/wiki/Proof_of_concept).
But, hopefully it will grow in something bigger and will serve mankind :) 

## **License**

*Every open-source project has a license - so I guess we also need to have one. Don't judge us for that.*

    Copyright 2017 The-Hitchhikers.inc
    
    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at
    
        http://www.apache.org/licenses/LICENSE-2.0
    
    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.