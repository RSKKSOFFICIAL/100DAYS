// SPDX-License-Identifier: MIT
pragma solidity >=0.7.0;
abstract contract Base{
    uint public num;
    function call() public pure virtual returns(uint);
}
contract Main is Base{
    function call() public pure override returns(uint){
        return 1;
    }
    
}