package com.nt.dao;

import java.util.List;

import com.nt.model.Hostel;

public interface IhostelInterface
{
  public List<Hostel> getHostelRooms(String city1,String city2,String city3,String city4)throws Exception;
}
