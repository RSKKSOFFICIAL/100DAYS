// I'm a comment!
// SPDX-License-Identifier: MIT

pragma solidity >=0.8.0 <0.9.0;
// pragma solidity ^0.8.0;
// pragma solidity >=0.8.0 <0.9.0;

contract SimpleStorage {
    // boolean, uint, int, address, bytes
    // bool isfavoriteNumber = true;
    // uint256 favoriteNumber= 7;
    // string favoriteNumbertext= "Seven";
    // int256 favoriteint= -5;
    // address myaddress = 0xb8FF51eA2D886Ca2B6BBadDE221BBf01fb0a376e;
    // bytes32 favoritebytes= "Horse";
    uint256 favoriteNumber;

    struct people{
        uint256 favoriteNumber;
        string name;
    }
    //uint256[] public favoriteNumberList;
    People[] public people;

    function store(uint256 _favoriteNumber) public {
        favoriteNumber = _favoriteNumber;
    }
    // view, pure 
    function retrieve() public view returns(uint256){
        return favoriteNumber;
    }
    // function add() public pure returns (uint256){
    //     return(1+1);
    // }
    function addperson(string memory _name, uint256 _favoriteNumber) public {
        People memory newPerson = People({favoriteNumber: _favoriteNumber, name: _name});
        people.push(newPerson);
    }

}
// 0xd9145CCE52D386f254917e481eB44e9943F39138
    // uint256 favoriteNumber;

//     struct People {
//         uint256 favoriteNumber;
//         string name;
//     }
//     // uint256[] public anArray;
//     People[] public people;

//     mapping(string => uint256) public nameToFavoriteNumber;

//     function store(uint256 _favoriteNumber) public {
//         favoriteNumber = _favoriteNumber;
//     }
    
//     function retrieve() public view returns (uint256){
//         return favoriteNumber;
//     }

//     function addPerson(string memory _name, uint256 _favoriteNumber) public {
//         people.push(People(_favoriteNumber, _name));
//         nameToFavoriteNumber[_name] = _favoriteNumber;
//     }
// }
