// SPDX-License-Identifier: MIT
pragma solidity >=0.7.0;
contract operators{
    uint public val=4;
    uint public val1=5;
     function arithmetic() public{
    //     val = val +2;
    //     val = val -2;
    //     val = val *2;
    //     val = val /2;
    //     val = val %2;
    //     val = val++;
    //     val = val--;
     }
    function relational() public view returns(bool){
    //     return val != 4;
   //      return val == 4;
    //     return val < 3;
     //    return val > 4;
     //    return val >= 4;
    //     return val <= 4;
    }
    function logical() public pure returns(bool){
        //return (2 >1 && 2>0);
        //return (2 >1 && 2>3);
        //return !(2 >1 && 2>3);
    }
    function bitwise() public view returns(int){
        //return (val & val1); //101 & 100 = 100
        //return (val | val1); //101 | 100 = 101
        //return (val ^ val1); //101 ^ 100 = 001
        //return (val >> val1); // 101 >> 100 = 0000000
        //return (val << val1); //101 << 100 = 10000000
        //return (~val); // ~100 = 11111010 = -6
    }
    function assignment() public {
        // val +=2;
        // val -=2;
        // val *=2;
        // val /=2;
        // val %=2;
        // val = 2;
     }
     function condition() public view returns(bool){
        return (val == 4 ? true : false);
     }
}