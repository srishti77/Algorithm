
public class SumSameNumber {
	
	public static void main(String args[]) {
		
		String values = "938427449468363235935164141137457346627316468733753676977948743374917918556846129623335361199267275377812693527676988542471955329161613617229888315662625415127885258239794969787446217853629534182213737756332281552759226779121311541863536317487613219623437488762632493137124184124287378349383591923842187911642148154382622227815223857676213257776321464256954529866893521691149346222962978697827354814717138432152595295919637772849363287261829118325688841777949512483782818729824478617587271329927176624669663125748445334712517623337323224538215865614217968757638895117595341928685867322113855391222957652312311487163748797877585577748392189656833328233313717573974623426274425625414923384351725461398147635514748797585968593652716173764492911934512727314976232515878459594693144773817324631176367799788842545229456282375113651527187472514358262371732439458739837129852336838659542671414871773534523765724971268589592143346894918223514669817439392828831398535576979948551174942355293599239162442457527833362547614888835571696762845486283446335783429178847967757656168117151612849573792315553343841315663915512883134989464631754653688631932857351262232578967211517161819554853494118493923391416643234932199287928734993281913591951895556145661598913722187548356159949334298159567896183656243543628567376421394175895448958265627112142955545536854528941698162496126196395336491837748377632214297593797155227164222493392632666555778758692766789825594711698827813197438138851427483385255269567971342483653634844927314941587252211152274944818899315981418341185399457914786738586761946777765494316981428792896665255212943982274185651226595566487245495115925561751313614271747177469822456654361759574275324414236443858972935693948338746636347722428347784388967922122934497444162444848985376411142579814125815524663684491471122293154872264729895374424268255156216646394269471563149789598164317419429482686856157858685132626261973127266539771138145974528121819651515591787769466318673259968891287814924268874158482283186174884581787168162169794447237768865836814569861486145651813837698968816692118722472694258999"
				+ "6534179549171859786241718727295379";
		String[] stringArray = values.split("");
		int[] value = new int[stringArray.length];
		
		for(int i =0 ;i < stringArray.length; i++) {
			value[i] = Integer.parseInt(stringArray[i]);
			
		}
		
		
		int sum =0;
		for(int i = 0; i< value.length/2; i++) {
			if(value[i] == value[value.length/2 +i]) {
				
				sum =sum + value[i] + value[value.length/2 +i];
				
				}
		
		}
		
		
		System.out.println("sum ="+ sum);
	}

}