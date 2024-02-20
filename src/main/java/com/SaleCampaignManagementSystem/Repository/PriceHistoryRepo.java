package com.SaleCampaignManagementSystem.Repository;

import com.SaleCampaignManagementSystem.Model.PriceHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PriceHistoryRepo extends JpaRepository<PriceHistory,Long> {
}
