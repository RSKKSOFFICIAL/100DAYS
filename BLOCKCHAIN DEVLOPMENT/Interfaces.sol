// SPDX-License-Identifier: MIT
pragma solidity >=0.7.0;

interface Name {
    function call() external pure returns(uint);   
}
contract Main is Name{
    function call() external pure override returns(uint){
        return 1;
    }   

}