// SPDX-License-Identifier: MIT
pragma solidity >=0.7.0;
contract varscope{
    uint public  val = 5;
    function get() public view returns (uint){
        return val;
    }
}
contract varscope2{
    varscope waste = new varscope();

    function get2() public view returns(uint){
        return waste.get();
    }
}