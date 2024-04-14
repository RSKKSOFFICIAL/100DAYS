// SPDX-License-Identifier: MIT
pragma solidity >=0.7.0;
contract Base{
    function val() public pure virtual returns(uint){
        return 6;
    }
}
contract Main is Base{
    function val() public pure override(Base) returns(uint){
        return 7;
    }
}