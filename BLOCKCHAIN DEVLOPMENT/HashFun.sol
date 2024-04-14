// SPDX-License-Identifier: MIT
pragma solidity >=0.7.0;
contract HashFun{
    //bytes32 public password;


    // function generatePass(string memory _pass) public pure returns(bytes32){
    //     return keccak256(abi.encodePacked(_pass));
    // }
    function generatePass(string memory _pass,string memory _name) public pure returns(bytes32){
        //return keccak256(abi.encodePacked(_pass,_name));
        return keccak256(abi.encode(_pass,_name));

    }
    // function sendMoney(string memory _pass) public view {
    //     require(keccak256(abi.encodePacked(_pass))==password,"Wrong password");
    // }
}