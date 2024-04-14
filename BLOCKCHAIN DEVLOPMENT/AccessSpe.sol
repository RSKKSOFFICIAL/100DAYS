// SPDX-License-Identifier: MIT
pragma solidity >=0.7.0;
contract a{
    function add(uint _num1, uint _num2) internal  pure returns(uint){
        return _num1 + _num2;
    }
}
contract b is a{
    function call() public pure returns(uint){
        return add(4,5);
    }

}