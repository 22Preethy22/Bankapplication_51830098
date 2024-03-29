package com.bankapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bankapp.model.entities.Account;
import com.bankapp.model.entities.AccountTransaction;
import com.bankapp.model.entities.AppUser;
import com.bankapp.model.entities.Customer;
import com.bankapp.model.entities.TransactionLog;
import com.bankapp.model.repo.AccountRepository;
import com.bankapp.model.repo.AccountTransactionRepository;
import com.bankapp.model.repo.CustomerRepository;
import com.bankapp.model.repo.TransactionLogRepository;
import com.bankapp.model.repo.UserRepository;
import com.bankapp.model.service.AccountService;
import com.bankapp.model.service.AccountTransactionService;

@SpringBootApplication
public class BankappFinalProjectApplication implements CommandLineRunner {
@Autowired
	private CustomerRepository customerRepository;
@Autowired
private UserRepository userRepository;
@Autowired
private AccountRepository accountRepository;
@Autowired
private AccountTransactionRepository accountTransactionRepository;
@Autowired
private TransactionLogRepository transactionLogRepository;
@Autowired
private AccountService accountService;
@Autowired
private AccountTransactionService accountTransactionService;
	public static void main(String[] args) {
		SpringApplication.run(BankappFinalProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		/*Account account=accountRepository.getAccountById(1L);
		List<AccountTransaction>list=account.getAccountTransactions();
		list.stream().forEach(tx->System.out.println(tx.getAmount()));
		
		//System.out.println(account.getAccountTransactions().size());
		System.out.println(account.getCustomer().getName());*/
		
		
		/*Customer customer1=new Customer("aarthi", "9780808766", "a@a.com", "vij") ;
		
		Customer customer2=new Customer("preethy", "978080766", "p@p.com", "vizag") ;
		
		Account account1=new Account(1200.00, "SAVINGS", false);

		Account account2=new Account(1200.00, "SAVINGS", false);
		
		customer1.setAccount(account1);
		customer2.setAccount(account2);

		account1.setCustomer(customer1);
		account2.setCustomer(customer2);
		
		accountRepository.save(account1);
		accountRepository.save(account2);
		
		
		AppUser appUser1=new AppUser("presy", "pr@p.com", "presy", new String[]{"ROLE_ADMIN","ROLE_MGR","ROLE_CLERK"}, true, "357429357");
		AppUser appUser2=new AppUser("ishu", "i@i.com", "ishu", new String[]{"ROLE_CLERK"}, true, "756429357");
		userRepository.save(appUser1);
		userRepository.save(appUser2);
		*/
		
		/*AccountTransaction  accountTransaction=accountTransactionRepository.findById(3l).orElseThrow(RuntimeException::new);
		System.out.println(accountTransaction);
		AccountTransaction accountTransaction2=accountTransactionRepository.findByIdAndAccountAccountNumber(1l, 1l);
		System.out.println(accountTransaction2);*/
	}

}
