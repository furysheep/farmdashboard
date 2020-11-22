package xyz.farmdashboard.server.entity;

import lombok.Data;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "income", indexes = {
    @Index(name = "idx_income", columnList = "timestamp")
})
@Cacheable(false)
public class IncomeEntity {
    @Id
    private String id;
    private long timestamp;
    private double amount;
    private double amountUsd;
    private double amountSum;
    private double amountSumUsd;
    private double psTvl;
    private double psTvlUsd;
    private double perc;
    private double weekPerc;
}