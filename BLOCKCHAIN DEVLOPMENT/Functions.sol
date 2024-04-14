// SPDX-License-Identifier: MIT
pragma solidity >=0.7.0;

contract Function{
    uint public val = 5;
    //code
    function add() public pure returns(uint){
        //code
        return 3+5;
    }
}

//pure ->> state variable dtate, edit
// view ->> state variable view