// SPDX-License-Identifier: MIT
pragma solidity >=0.7.0;

contract ifelse {
    uint   a = 5;
    uint  b =6;

    function get() public view returns(uint){
        if(a == 6){
            return 1;
        }else if (a == 7){
            return 3;
        }
        else {
            return 4;
        }
    }
}