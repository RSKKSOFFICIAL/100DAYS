// SPDX-License-Identifier: MIT
import "HashFun.sol";
pragma solidity >=0.7.0;
contract a{
    uint public num = 1;
    // constructor(uint _num){
    //     num = _num;
    // }
}
// contract b is a(4){
//     function getVal() public view returns(uint){
//         return num;
//     }
// }
// contract b is a{
//     constructor() a(4){

//     }
//     function getVal() public view returns(uint){
//         return num;
//     }
// }
contract b is HashFun{
    function getVal() public view returns(uint){
    }
}
contract c is HashFun,a{
    function getVal() public view returns(uint){
        return num;
    }
}