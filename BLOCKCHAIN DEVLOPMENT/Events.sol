// SPDX-License-Identifier: MIT
pragma solidity >=0.7.0;
contract Event{
    event transfer(address _from,address _to, uint _amount);
    function tran(address to, uint amount) public {
        emit transfer(msg.sender, to, amount);
    }
}