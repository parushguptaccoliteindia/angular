import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
@Injectable({
  providedIn: 'root'
})
export class IderaServerService {

  constructor(private htttp:HttpClient) { }

  getServerData(){
    var data= this.htttp.get("/backend/api/server/list");
    return data;
  }

}
