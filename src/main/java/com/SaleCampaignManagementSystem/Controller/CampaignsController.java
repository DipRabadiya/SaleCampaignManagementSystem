package com.SaleCampaignManagementSystem.Controller;

import com.SaleCampaignManagementSystem.Model.Campaigns;
import com.SaleCampaignManagementSystem.Model.dto.CompaignsDTO;
import com.SaleCampaignManagementSystem.Service.CampaignsService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;

@RestController
@RequestMapping("CreateCampaign")
@Tag(name = "Greeting", description = "Endpoints for greeting messages")
public class CampaignsController {

    @Autowired
    CampaignsService campaignsService;

    @PostMapping("/campaign")
    public Campaigns campaigns(@RequestBody CompaignsDTO campaigns) throws ParseException {
        return campaignsService.createCampaigns(campaigns);
    }
}
