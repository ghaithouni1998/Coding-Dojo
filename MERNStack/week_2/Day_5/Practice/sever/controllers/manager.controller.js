const ProductManager=require('../models/manager.model')

module.exports.findlAllProductManagers=(req,res)=>{
    ProductManager.find()
        .then(allProductManagers=>{console.log("All ProductManagers From DB", allProductManagers);
        res.status(200).json({ data: allProductManagers, message: 'All ProductManagers List', ok: true })
        })
        .catch(error=>{
            console.log(error);
            res.status(404).json({error})
        })
}

module.exports.findOneProductManagerById=(req,res)=>{
    ProductManager.findById({ _id: req.params.id })
        .then(oneProductManager=>{
            console.log("ProductManager Found", oneProductManager);
            if(!oneProductManager) {
                res.status(404).json({ error:"ProductManager Not Found", ok:false })
            }else{
                res.status(200).json({ data: oneProductManager, message: 'ProductManager Found', ok: true })
            }
        })
        .catch(error=>{
            console.log(error);
            res.status(500).json({error})
        })

}
 
module.exports.createNewProductManager = (req, res) => {
    ProductManager.create(req.body)
        .then(newCreatedProductManager => {
            console.log("New  Movie", newCreatedProductManager);
            res.status(201).json({ data: newCreatedProductManager, message: 'ProductManager Created with success', ok: true })
        })
        .catch(error => {
            console.log(error);
            res.status(500).json({ error })
        })
}