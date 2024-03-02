package model.services;

import model.entities.Contract;

public class ContractService {
    private OnlinePaymentService onlinePaymentService;
    private Contract contract;


    public ContractService(OnlinePaymentService onlinePaymentService, Contract contract) {
        this.onlinePaymentService = onlinePaymentService;
        this.contract = contract;
    }

    public void processContract(Contract contract, int months){
        double installment = contract.getTotalValue() / months;

        onlinePaymentService.interest(installment, months);

        }


    }


}
