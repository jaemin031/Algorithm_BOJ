#include<stdio.h>
#include<string.h>

struct allbem{
	int year;
	char name[100];
}ab[25];



int main()
{
	ab[0].year=1967;	strcpy(ab[0].name,"DavidBowie");
	ab[1].year=1969;	strcpy(ab[1].name,"SpaceOddity");
	ab[2].year=1970;	strcpy(ab[2].name,"TheManWhoSoldTheWorld");
	ab[3].year=1971;	strcpy(ab[3].name,"HunkyDory");
	ab[4].year=1972;	strcpy(ab[4].name,"TheRiseAndFallOfZiggyStardustAndTheSpidersFromMars");
	ab[5].year=1973;	strcpy(ab[5].name,"AladdinSane");
	ab[6].year=1973;	strcpy(ab[6].name,"PinUps");
	ab[7].year=1974;	strcpy(ab[7].name,"DiamondDogs");
	ab[8].year=1975;	strcpy(ab[8].name,"YoungAmericans");
	ab[9].year=1976;	strcpy(ab[9].name,"StationToStation");
	ab[10].year=1977;	strcpy(ab[10].name,"Low");
	ab[11].year=1977;	strcpy(ab[11].name,"Heroes");
	ab[12].year=1979;	strcpy(ab[12].name,"Lodger");
	ab[13].year=1980;	strcpy(ab[13].name,"ScaryMonstersAndSuperCreeps");
	ab[14].year=1983;	strcpy(ab[14].name,"LetsDance");
	ab[15].year=1984;	strcpy(ab[15].name,"Tonight");
	ab[16].year=1987;	strcpy(ab[16].name,"NeverLetMeDown");
	ab[17].year=1993;	strcpy(ab[17].name,"BlackTieWhiteNoise");
	ab[18].year=1995;	strcpy(ab[18].name,"1.Outside");
	ab[19].year=1997;	strcpy(ab[19].name,"Earthling");
	ab[20].year=1999;	strcpy(ab[20].name,"Hours");
	ab[21].year=2002;	strcpy(ab[21].name,"Heathen");
	ab[22].year=2003;	strcpy(ab[22].name,"Reality");
	ab[23].year=2013;	strcpy(ab[23].name,"TheNextDay");
	ab[24].year=2016;	strcpy(ab[24].name,"BlackStar");
	
	int Q;

	scanf("%d",&Q);

	for(int tc=1;tc<=Q;tc++)
	{
		int count=0;
		int S,E;
		scanf("%d %d",&S,&E);
		for(int i=0;i<=24;i++)
			if(S<=ab[i].year&&ab[i].year<=E)
				count++;
		printf("%d\n",count);
		for(int i=0;i<=24;i++)
			if(S<=ab[i].year&&ab[i].year<=E)
				printf("%d %s\n",ab[i].year,ab[i].name);

	}
}
