// SPDX-License-Identifier: MIT
pragma solidity >=0.7.0;
contract error {
    address public owner;
    uint public count;
     constructor(){
        owner = msg.sender;
     }
     function call() public{
        count++;
        //require(msg.sender == owner, 'Caller is not owner ');
        // assert(msg.sender == owner);
        if(msg.sender != owner){
            revert("caller is not owner");
        }}
     }
