package com.directi.training.srp.exercise_refactored;

public class CarManager
{
    private final DbManager _carDao;
    private final NameManager _carFormatter;
    private final RatingManager _carRater;

    public CarManager(DbManager carDao, NameManager carFormatter, RatingManager carRater)
    {
        _carDao = carDao;
        _carFormatter = carFormatter;
        _carRater = carRater;
    }

    public Car getCarById(final String carId)
    {
        return _carDao.findById(carId);
    }

    public String getCarsNames()
    {
        return _carFormatter.getCarsNames(_carDao.findAll());
    }

    public Car getBestCar()
    {
        return _carRater.getBestCar(_carDao.findAll());
    }
}