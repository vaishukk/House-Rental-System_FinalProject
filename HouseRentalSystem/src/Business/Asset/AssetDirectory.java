/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Asset;

import java.util.ArrayList;

/**
 *
 * @author Kiran
 */
public class AssetDirectory {
    private ArrayList<Asset> assetList = new ArrayList<Asset>();

    public ArrayList<Asset> getAssetList() {
        return assetList;
    }

    public void setAssetList(ArrayList<Asset> assetList) {
        this.assetList = assetList;
    }
    
    
    
}