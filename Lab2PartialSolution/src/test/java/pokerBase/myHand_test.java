package pokerBase;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


import java.util.ArrayList;

import pokerEnums.eCardNo;
import pokerEnums.eHandStrength;
import pokerEnums.eRank;
import pokerEnums.eSuit;

public class myHand_test {
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void TestFourOfAKind(){
		
		HandScore hs = new HandScore();
		ArrayList<Card> FourOfAKind = new ArrayList<Card>();
		FourOfAKind.add(new Card(eSuit.CLUBS,eRank.ACE,14));
		FourOfAKind.add(new Card(eSuit.SPADES,eRank.ACE,14));
		FourOfAKind.add(new Card(eSuit.HEARTS,eRank.ACE,14));
		FourOfAKind.add(new Card(eSuit.DIAMONDS,eRank.ACE,14));
		FourOfAKind.add(new Card(eSuit.CLUBS,eRank.KING,13));
		
		assertEquals(hs.getHiHand(),eRank.ACE.getiRankNbr());
		assertEquals(hs.getKickers().get(eCardNo.FirstCard.getCardNo()).geteSuit(),eSuit.CLUBS);
		assertEquals(hs.getKickers().get(eCardNo.FirstCard.getCardNo()).geteRank(),eRank.KING);
	}
public void TestFullHouse() {
		
		HandScore hs = new HandScore();
		ArrayList<Card> FullHouse = new ArrayList<Card>();
		FullHouse.add(new Card(eSuit.CLUBS,eRank.ACE,14));
		FullHouse.add(new Card(eSuit.CLUBS,eRank.ACE,14));
		FullHouse.add(new Card(eSuit.SPADES,eRank.TWO,2));		
		FullHouse.add(new Card(eSuit.HEARTS,eRank.TWO,2));
		FullHouse.add(new Card(eSuit.DIAMONDS,eRank.TWO,2));
		
			
		assertEquals(hs.getHiHand(),eRank.ACE.getiRankNbr());		
	}
	
public void TestStraight() {
		
		HandScore hs = new HandScore();
		ArrayList<Card> Straight = new ArrayList<Card>();
		Straight.add(new Card(eSuit.SPADES,eRank.SIX,6));
		Straight.add(new Card(eSuit.CLUBS,eRank.FIVE,5));
		Straight.add(new Card(eSuit.DIAMONDS,eRank.FOUR,4));		
		Straight.add(new Card(eSuit.HEARTS,eRank.THREE,3));
		Straight.add(new Card(eSuit.DIAMONDS,eRank.TWO,2));
		
		assertEquals(hs.getHiHand(),eRank.SIX.getiRankNbr());		
	}
	
	

public void TestThreeOfAKind() {
		
		HandScore hs = new HandScore();
		ArrayList<Card> ThreeOfAKind = new ArrayList<Card>();
		ThreeOfAKind.add(new Card(eSuit.HEARTS,eRank.ACE,14));
		ThreeOfAKind.add(new Card(eSuit.HEARTS,eRank.ACE,14));
		ThreeOfAKind.add(new Card(eSuit.HEARTS,eRank.ACE,14));		
		ThreeOfAKind.add(new Card(eSuit.CLUBS,eRank.FIVE,5));
		ThreeOfAKind.add(new Card(eSuit.DIAMONDS,eRank.FOUR,4));
			
		assertEquals(hs.getHiHand(),eRank.ACE.getiRankNbr());
		assertEquals(hs.getKickers().get(eCardNo.FirstCard.getCardNo()).geteSuit(), eSuit.CLUBS);		
		assertEquals(hs.getKickers().get(eCardNo.FirstCard.getCardNo()).geteRank(), eRank.FIVE);
		assertEquals(hs.getKickers().get(eCardNo.FifthCard.getCardNo()).geteSuit(), eSuit.DIAMONDS);		
		assertEquals(hs.getKickers().get(eCardNo.FifthCard.getCardNo()).geteRank(), eRank.FOUR);
		
	}
	
	

public void TestTwoPair() {
		
		HandScore hs = new HandScore();
		ArrayList<Card> TwoPair = new ArrayList<Card>();
		TwoPair.add(new Card(eSuit.CLUBS,eRank.ACE,14));
		TwoPair.add(new Card(eSuit.CLUBS,eRank.ACE,14));
		TwoPair.add(new Card(eSuit.SPADES,eRank.THREE,3));		
		TwoPair.add(new Card(eSuit.HEARTS,eRank.THREE,3));
		TwoPair.add(new Card(eSuit.DIAMONDS,eRank.TWO,2));
		
		assertEquals(hs.getHiHand(),eRank.ACE.getiRankNbr());		
		assertEquals(hs.getKickers().get(eCardNo.ThirdCard.getCardNo()).geteSuit(), eSuit.DIAMONDS);		
		assertEquals(hs.getKickers().get(eCardNo.FifthCard.getCardNo()).geteRank(), eRank.TWO);
	}
	
public void TestPair() {
		
		HandScore hs = new HandScore();
		ArrayList<Card> Pair = new ArrayList<Card>();
		Pair.add(new Card(eSuit.CLUBS,eRank.FIVE,5));
		Pair.add(new Card(eSuit.CLUBS,eRank.FIVE,5));
		Pair.add(new Card(eSuit.SPADES,eRank.FOUR,4));		
		Pair.add(new Card(eSuit.DIAMONDS,eRank.THREE,3));
		Pair.add(new Card(eSuit.HEARTS,eRank.TWO,2));
			
		assertEquals(hs.getHiHand(),eRank.FIVE.getiRankNbr());		
		assertEquals(hs.getKickers().get(eCardNo.FirstCard.getCardNo()).geteSuit(), eSuit.SPADES);		
		assertEquals(hs.getKickers().get(eCardNo.FirstCard.getCardNo()).geteRank(), eRank.FOUR);
		assertEquals(hs.getKickers().get(eCardNo.ThirdCard.getCardNo()).geteSuit(), eSuit.DIAMONDS);		
		assertEquals(hs.getKickers().get(eCardNo.ThirdCard.getCardNo()).geteRank(), eRank.THREE);
		assertEquals(hs.getKickers().get(eCardNo.FifthCard.getCardNo()).geteSuit(), eSuit.HEARTS);		
		assertEquals(hs.getKickers().get(eCardNo.FifthCard.getCardNo()).geteRank(), eRank.TWO);
	}
	
	

public void TestHighCard() {
		
		HandScore hs = new HandScore();
		ArrayList<Card> HighCard = new ArrayList<Card>();
		HighCard.add(new Card(eSuit.CLUBS,eRank.JACK,11));
		HighCard.add(new Card(eSuit.CLUBS,eRank.TEN,10));
		HighCard.add(new Card(eSuit.HEARTS,eRank.FIVE,5));		
		HighCard.add(new Card(eSuit.SPADES,eRank.FOUR,4));
		HighCard.add(new Card(eSuit.DIAMONDS,eRank.TWO,2));
			
		assertEquals(hs.getHiHand(),eRank.TEN.getiRankNbr());		
		assertEquals(hs.getKickers().get(eCardNo.FirstCard.getCardNo()).geteSuit(), eSuit.CLUBS);		
		assertEquals(hs.getKickers().get(eCardNo.FirstCard.getCardNo()).geteRank(), eRank.TEN);
		assertEquals(hs.getKickers().get(eCardNo.SecondCard.getCardNo()).geteSuit(), eSuit.HEARTS);		
		assertEquals(hs.getKickers().get(eCardNo.SecondCard.getCardNo()).geteRank(), eRank.FIVE);
		assertEquals(hs.getKickers().get(eCardNo.ThirdCard.getCardNo()).geteSuit(), eSuit.SPADES);		
		assertEquals(hs.getKickers().get(eCardNo.ThirdCard.getCardNo()).geteRank(), eRank.FOUR);
		assertEquals(hs.getKickers().get(eCardNo.FourthCard.getCardNo()).geteSuit(), eSuit.DIAMONDS);		
		assertEquals(hs.getKickers().get(eCardNo.FourthCard.getCardNo()).geteRank(), eRank.TWO);
		
	}
}
	
	
