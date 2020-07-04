// create database
use healthAdministrator

// hospitals collection
db.hospitals.createIndex({ "name": 1 }, { unique: true})

db.hospitals.insertMany([
{
    "_id": ObjectId("5efe2f4198b62ecff6d8a945"),
    "name": "Hospital Cochabamba"
},{
    "_id": ObjectId("5efe2f5e98b62ecff6d8a946"),
    "name": "Hospital Viedma"
},{
    "_id": ObjectId("5efe2f7798b62ecff6d8a947"),
    "name": "Clinica Los Angeles"
},{
    "_id": ObjectId("5efe2f8b98b62ecff6d8a948"),
    "name": "Hospital Univalle"
},{
    "_id": ObjectId("5efe7e777c51526c86054377"),
    "name": "Clinica Los Olivos"
},{
    "_id": ObjectId("5effafc7272c3a309395ef37"),
    "name": "Hospital del Norte"
},{
    "_id": ObjectId("5effb3811c58090d0ab9e24f"),
    "name": "Hospital Belga"
},{
    "_id": ObjectId("5effb5551c58090d0ab9e250"),
    "name": "Clinica Copacabana"
},{
    "_id": ObjectId("5effb5661c58090d0ab9e251"),
    "name": "Clinica Cochabamba"
},{
    "_id": ObjectId("5effb5751c58090d0ab9e252"),
    "name": "CIES Cochabamba"
},{
    "_id": ObjectId("5effb5891c58090d0ab9e253"),
    "name": "Hospital Harry Williams"
},{
    "_id": ObjectId("5effb5961c58090d0ab9e254"),
    "name": "Hospital Solomon Klein"
}])