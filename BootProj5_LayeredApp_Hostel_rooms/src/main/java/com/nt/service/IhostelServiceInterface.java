package com.nt.service;

import java.util.List;

import com.nt.model.Hostel;

public interface IhostelServiceInterface
{
  public List<Hostel> fetchHostelRooms(String city1,String city2,String city3,String city4)throws Exception;
}
