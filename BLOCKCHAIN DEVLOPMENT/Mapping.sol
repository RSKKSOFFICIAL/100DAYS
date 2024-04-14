// SPDX-License-Identifier: MIT
pragma solidity >=0.7.0;
contract Mappings{
    mapping (address => uint) public balance;
    function setBalance(uint bal) public {
        balance[msg.sender] = bal;
    }
}