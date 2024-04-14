// SPDX-License-Identifier: MIT
pragma solidity >=0.7.0;
contract Loops{
    uint public a = 5;
    uint public b = 7;
    uint public c;
    function get() public{
        // while (a < b){
        //     a = a+5;
        // }
        // do {
        //     a =a+1;
        // } 
        // while (a < 10);
        for (c = 0; c < 5; c++) 
        {
            b +=1;
        } 

    }
}