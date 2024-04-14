// SPDX-License-Identifier: MIT
pragma solidity >=0.7.0;
contract Units{
    modifier amount{
        require(msg.value > 1 ether);
        _;
        require(block.timestamp< 2 seconds);
        
    }
    function send() public payable amount{

    }
}