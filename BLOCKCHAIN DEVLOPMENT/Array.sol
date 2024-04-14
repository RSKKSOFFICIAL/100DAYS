// SPDX-License-Identifier: MIT
pragma solidity >=0.7.0;
contract array{
    uint[] public numbers = [1,2,3,4];
    uint[4] public numbers1 = [1,2,3];
    function getArr() public view returns(uint[] memory){
        return numbers;
    }
    function getArr1() public returns(uint){
        numbers[0] =5;
        return numbers[0];
    }
    function getArr2() public view returns(uint){
        return numbers.length;
    }
    function getArr3() public  {
        numbers.push(6);
        numbers.pop();
    }
}