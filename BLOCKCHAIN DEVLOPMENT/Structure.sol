// SPDX-License-Identifier: MIT
pragma solidity >=0.7.0;
contract Struc{
    struct student{
        string name;
        uint age;
    }
    

    student public newS;
    function get() public {
        newS = student('Ravi',17);
    }
    function getage() public view returns(uint) {
        return newS.age;
    }
    student[] public allS;

    function getS(string memory naam,uint saal) public{
        student memory newstudent = student({
            name: naam,
            age: saal       
        });
        allS.push(newstudent);
    }

}