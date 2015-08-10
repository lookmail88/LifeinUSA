var menudata=[
	{"title":"Dashboard","iconclass":"glyphicon glyphicon-dashboard","url":"/partner/dashboard.html","submenu":null},
	{"title":"Profile","iconclass":" glyphicon glyphicon-user gsidebar-logo","url":"/partner/profile.html","submenu":null},
	{"title":"Message","iconclass":"glyphicon glyphicon-comment gsidebar-logo","url":"/partner/message.html","submenu":null},
	{"title":"WeiXin","iconclass":"glyphicon glyphicon-qrcode gsidebar-logo","url":"/partner/wx_dashboard.html","submenu":[
		{"title":"Recourse","url":"/partner/wx_resource.html","submenu":null},
		{"title":"Letters","url":"/partner/wx_letters.html","submenu":null},
		{"title":"Post","url":"/partner/wx_post.html","submenu":null},
		{"title":"Pages-pool","url":"/partner/wx_pages_pool.html","submenu":null},
		{"title":"Setting","url":"/partner/wx_settings.html","submenu":null}
	]},		 
	{"title":"Blog","iconclass":"glyphicon glyphicon glyphicon-list-alt","url":"blog.html","submenu":null},	
	{"title":"Payments","iconclass":"glyphicon glyphicon-credit-card","url":"faq.html","submenu":null},
	{"title":"Help","iconclass":"glyphicon glyphicon-question-sign","url":"contactus.html","submenu":null}
			 ];




var servicesdescs=[
	{
	"imagepath":"/images/service-1-0.jpg",
	"title":"Dog Walking",
	"desc":"North County Pet Sitting is licensed and insured. We specialize in professional pet care including dog walking, puppy checks and pet sitting. ",
	 "url":"/sdogwalking.html"
	},
	{
	"imagepath":"/images/service-3-0.jpg",
	"title":"Doggie Daycare",
	"desc":"We offer doggie daycare for small dogs under 40 pounds, which includes pick up and drop off of your pet! Convenient for busy dog owners who want to come home to a happy, loved and exercised pet.",
	"url":"/sdoggiedaycare.html"},
	{
	"imagepath":"/images/service-2-0.jpg",
	"title":"Cat Sitting",
	 "desc":"North County Pet Sitting is licensed and insured. We specialize in professional pet care including cat sitting and kittens too.",
	 "url":"/scatsitting.html"},
	{
	"imagepath":"/images/service-4-0.jpg",
	"title":"Overnight",
	 "desc":"We specialize in professional pet care including dog walking, puppy checks, pet taxi and over night pet sitters. ",
	 "url":"/sovernight.html"},
	{
	"imagepath":"/images/service-5-0.jpg",
	"title":"Boarding",
	 "desc":"We offer on a very limited basis boutique style private in home boarding for well behaved dogs and cats. ",
	 "url":"/sboarding.html"},
	{
	"imagepath":"/images/service-6-0.jpg",	
	"title":"Pet Taxi",
	 "desc":"We are offer pet taxi services in North County San Diego. Your pet will be transported in an air-conditioned Honda Odyssey mini-van with plenty of room!",
	 "url":"/spettaxi.html"}
];

var pricetable=[
	{"title":"Dog Walking / Dog Sitting",
	  "desc":"Dogs and Puppies will be given fresh water and food or treats per your instructions, taken for a walk, given love, play time and any medication. Each visit lasts from 30 to 45 minutes. Extra services we can provide at no additional cost: watering indoor plants, adjust lights and window coverings for extra security.",
	 "prices":[{"price":"$25","desc":"for daily visit for Dogs and Puppies"},{"price":"$43","desc":" for 2 visits per day"},{"price":"$59","desc":" for 3 visits per day"}]},
	
		{"title":"Doggie Daycare for Small Dogs!",
	     "desc":"Finally a place for small dogs to call their own! Packed with fun all day long! Doggie Daycare includes pick up and drop off for dogs under 40 pounds.",
	     "prices":[
			 {"price":"$40","desc":""}]},
	    {"title":"Dog Park",
	     "desc":"1 hour field trip to the dog park. Includes pick up and drop off.",
	     "prices":[
			 {"price":"$30","desc":""}]},
	 {"title":"Cat Sitting",
	     "desc":"Cats and Kittens will be given fresh water and food or treats per your instructions, clean litter box, brushed and petted and lots of love. Each visit lasts about 30 to 45 minutes. Extra services we can provide at no additional cost: watering indoor plants, adjust lights and window coverings for extra security.",
	     "prices":[
			 {"price":"$20","desc":"for daily visit for Cats and Kittens"},{"price":"$35","desc":"for two daily visit for Cats and Kittens"}]},
	{"title":"Overnight",
	 "desc":"We will stay overnight with your pet from 9:00 pm to 7:00 am, also includes a morning and evening walk!",
	 "prices":[{"price":"$85","desc":""}]},
	{"title":"Private In Home Boarding",
	  "desc":"You dog will be our family dog while you are away. Cage free in a loving family home.",
	     "prices":[
			 {"price":"$60","desc":"for up to 24 hours."},{"price":"$25","desc":"for each additional dog from same house. "}]},
	
	{"title":"Pet Taxi",
	  "desc":"If you have a busy schedule, we offer our pet taxi services to take your dog to the vet, groomer or any other place you would like us to take your pet within 10 miles. ",
	     "prices":[
			 {"price":"$20","desc":""}]}, 
 
		{"title":"Additional charges for all above services",
	  "desc":"",
	   "prices":[
			 {"price":"$5","desc":"extra charge per day for additional pets in the same home."},
		   {"price":"$10","desc":"extra charge per day for Holidays."},
		   {"price":"$5","desc":"Key Pick Up/ Drop Off"},
		   {"price":"","desc":"We pick up key for free on the first visit any additional pick up or drop off services $5 We will keep your key for you at no charge."}]} 
];


var questions=[
	{
		"id":"1",
		"q":"What areas of San Diego County do you serve?",
		"a":"We normally cover the North County area, from Solana Beach inland to Black Mountain Ranch and south to Del Mar and Poway, however, we can accommodate other parts of San Diego. Please call us for details."
	},
	{
		"id":"2",
		"q":"Will you take my pet to the veterinarian for me?",
		"a":"We offer our pet taxi services to take your dog to the vet, groomer or any other place you would like us to take your pet within 10 miles radius."
	},
	{
		"id":"3",
		"q":"Do you take care of other pets besides dogs?",
		"a":"In addition to dogs, we will take care of cats and kittens. They will be given fresh water and food or treats per your instructions and we will clean their litter box!"
	},
	{
		"id":"4",
		"q":"Our family likes to visit relatives over the holidays. Are you available over the holidays?",
		"a":"We are aware that the holidays are favorite times for families to take their vacations. We will accommodate you holiday schedule at the same rates as the rest of the year."
	},
	{
		"id":"5",
		"q":"I have an erratic schedule. Are you available on short notice—24 hours or less?",
		"a":"Busy people are our primary customers. If you need pet sitting or dog walking in less than 24 hours, just call me at (858) 200-6600. We are open 7 days a week!"
	},
	{
		"id":"6",
		"q":"Do you keep to a schedule? ",
		"a":"After consulting with you we will set up a schedule and stay with it to avoid any undue stress to your pet."
	},
	{
		"id":"7",
		"q":"Will you take care of multiple pets?",
		"a":"We can take care of additional pets at an additional per pet charge."
	},
	{
		"id":"8",
		"q":"Will you give my pets medication? ",
		"a":"We can provide oral medications with food provided we are given specific instructions."
	},
	{
		"id":"9",
		"q":"I don’t like my pet kept on a cage. What are your boarding facilities like? ",
		"a":"Your pet will stay with us in our house and if he sleeps in your bed... he can sleep in ours too!"
	},
	{
		"id":"10",
		"q":"Are you bonded, license and insured? ",
		"a":"North County Pet Sitting is fully bonded, licensed and insured. You can feel confident that your pets and property are fully covered,should anything occur while our sitter’s are present."
	},
	{
		"id":"11",
		"q":"I work long hours. Can you take my dog all day on outings with other dogs? ",
		"a":"We offer doggie daycare for small dogs under 40 pounds. We take your dog on an adventure every day! Your dog will run and play, go on hikes and group outings to dog parks."
	},
	{
		"id":"12",
		"q":"Can I get references? ",
		"a":"References are available on request."
	},
	{
		"id":"13",
		"q":"Can I get daily updates on my dog while I am away? ",
		"a":"As part of our service, we will e-mail you a daily status of our dog including a photo."
	}
];
 


var sdogwalking={
		"title":"Dogwalking",
		"img":"/images/s_dogsitting.jpg",
		"testimonial":"For doggie day care, Kristy always comes to pick him up and drop him off so I don't have to worry about that on the way to or from work. ",
		"person":"Sabrina S.",
		"location":"San Diego, CA",
		"contents":[{
			"title":"Dogwalking and Pet Sitting",
			"content":"Dogs and Puppies will be given fresh water and food or treats per your instructions, taken for a walk, given love, play time and any medication. Each Visit lasts about 30 to 45 minutes. We can also provide these extra services at no additional cost: watering indoor plants and adjusting lights and window coverings for home-security. <br><br> North County Pet Sitting and Doggie Daycare is located in San Diego. We specialize in Doggy Day Care services and professional in-home pet care for dogs and cats. North County Pet Sitting and Doggie Daycare is fully licensed and insured. We are loving pet care givers and offer full day and half day doggie daycare services as well as stress free pet sitting, mid-day walks and puppy checks for the busy pet owner so you can come home to a happy well exercised pet. We also offer pet sitter services when you are out of town.<br><br>Dog walking, puppy checks and pet taxi services are offered in North County San Diego including 92127, 92128, 92129, 92130, 92131, 92064, 92075, 92014, 92067 zip codes and Rancho Bernardo, Scripps Ranch, Poway and Mira Mesa. Our Doggie Daycare area covers Santaluz, Crosby Estates, Del Sur, 4S Ranch, Rancho Bernardo, Rancho Penasquitos, Rancho Santa Fe, Scripps Ranch, Carmel Valley, Torrey Del Mar, and Fairbanks Ranch.<br><br>Dogs must be up to date on shots and vaccinations: Rabies, DHPP and Bordetella.<br><br>Please call (858) 200-6600 or email North County Pet Sitting for pet sitting in other parts of San Diego."
			},{
			"title":"We are available on short notice!",
			"content":"If you need pet sitting or dog walking in less than 24 hours, please call me at (858) 200-6600. We are open 7 days a week!"
			}]
		};

var sdoggiedaycare={
		"title":"Doggie Daycare",
		"img":"/images/s_daycare.jpg",
		"testimonial":"I know our pets can be a handful but Rumi always takes great care of them and when we return it is like we never left.  I would absolutely recommend North County Pet Sitting!",
		"person":"K.J.",
		"location":"San Diego, CA",
		"contents":[{
			"title":"Doggie Daycare",
			"content":"We offer doggie daycare for small dogs under 40 pounds, which includes pick-up and drop-off of your pet! Convenient for busy dog owners who want to come home to a happy, loved and exercised pet.Doggie daycare is available Monday through Friday. Dogs must be over 6 months old and up to date on shots and vaccinations: Rabies, DHPP and Bordetella.We only accept dogs that are friendly, social and  that we feel are best suited for daycare. <br><br>North County Pet Sitting is licensed, insured and experienced with pets. We take your dog on an adventure every day! Your dog will run and play, go on hikes and group outings to dog parks. We provide a safe and friendly environment for your pet. <br><br>Please make sure that your dog has a collar and tags!<br><br>Our doggie daycare currently serves the following areas: Santaluz, Fairbanks Ranch, 4S Ranch, Del Sur, Torrey Del Mar, Carmel Valley, Rancho Bernardo, Scripps Ranch and Rancho Penasquitos. If you are outside of our area please call to see if we can pick up in your area."
			},{
			"title":"We are available on short notice!",
			"content":"If you need pet sitting or dog walking in less than 24 hours, please call me at (858) 200-6600. We are open 7 days a week!"
			}]
		};
 var scatsitting={
		"title":"Cat Sitting",
		"img":"/images/s_catsitting.jpg",
		"testimonial":"I have used North County Pet Sitting for 1 year and I wouldn't use anyone else. Rumi and Kristy are so caring when they watch my dog, Riley and my cat, Brownie. ",
		"person":"Cara F.",
		"location":"Rancho Santa Fe, CA",
		"contents":[{
			"title":"Cat Sitting",
			"content":"Cats and kittens will be given fresh water and food or treats per your instructions, clean litter box, brushed and petted and lots of love. Each Visit lasts about 30 to 45 minutes. We can also provide these extra services at no additional cost: watering indoor plants and adjusting lights and window coverings for home-security.<br><br>North County Pet Sitting is fully licensed and insured. <br><br>We are offer cat sitting services in North County San Diego including Rancho Penasquitos, 4S Ranch, Santaluz, Rancho Santa Fe, Del Mar, Solana Beach, Carmel Mountain Ranch, Scripps Ranch, Poway, Mira Mesa and Carmel Valley."
			},{
			"title":"We are available on short notice!",
			"content":"If you need pet sitting or dog walking in less than 24 hours, please call me at (858) 200-6600. We are open 7 days a week!"
			}
				   ]
		};

var sovernight={
		"title":"Overnight",
		"img":"/images/s_overnight.jpg",
		"testimonial":"I am so happy that Rumi was able to fit us into her schedule, and I will most definitely call her the next time I travel. If you are thinking about hiring a walker, I highly recommend North County Pet Sitting.",
		"person":"Ashley M.",
		"location":"San Diego, CA ",
		"contents":[{
			"title":"Overnight Pet Care",
			"content":"If your pet is especially sensitive, we will stay overnight with your pet from 9:00 pm to 7:00 am. This service also includes a morning and evening walk! This also provides the added sense of security knowing that someone is watching over your home as well as tour pet while you are away.<br><br>North County Pet Sitting is fully licensed and insured. We specialize in professional pet care including dog walking, puppy checks, pet taxi and over night pet sitters. <br><br>We offer overnight pet sitting services in North County San Diego including Rancho Penasquitos, 4S Ranch, Santaluz, Rancho Santa Fe, Del Mar, Solana Beach, Carmel Mountain Ranch, Scripps Ranch, Poway, Mira Mesa and Carmel Valley.Dogs must be up to date on shots and vaccinations: Rabies, DHPP and Bordetella."
			},{
			"title":"We are available on short notice!",
			"content":"If you need pet sitting or dog walking in less than 24 hours, please call me at (858) 200-6600. We are open 7 days a week!"
			}
				   ]
		};

var sboarding={
		"title":"Boarding",
		"img":"/images/s_boarding.jpg",
		"testimonial":"Rumi is always very communicative and responsible. When we are away, she updates us on a daily basis including e-mailing photos of our dog Kenzi to us. I would highly recommend her services.",
		"person":"Nathaniel B.",
		"location":"La Jolla, CA ",
		"contents":[{
			"title":"Private In Home Boarding",
			"content":"Limited Space Available! We offer on a very limited basis boutique style private in-home boarding for well behaved dogs and cats. Pets must be friendly with small children, dog friendly, house trained and up to date on shots. We have found that this works very well for dogs that need a loving family around. <br><br>Your pet will stay with us in our house and if he sleeps in your bed... he can sleep in ours too! Your dog will be able to join our doggie daycare group for a very discounted rate while he stays with us!Dogs must be up to date on shots and vaccinations: Rabies, DHPP and Bordetella."
			},{
			"title":"We are available on short notice!",
			"content":"If you need pet sitting or dog walking in less than 24 hours, please call me at (858) 200-6600. We are open 7 days a week!"
			}]
		};

var spettaxi={
		"title":"Pet Taxi",
		"img":"/images/s_pettaxi.jpg",
		"testimonial":"I know Buck can be a handful but she always takes great care with him and when I return it is like I never left.  And, recently, I have had to contact them on short notice and they are always able to accomodate my schedule.",
		"person":"Allison F.",
		"location":"La Jolla, CA ",
		"contents":[{
			"title":"Pet Taxi Services",
			"content":"If you have a busy schedule, we offer our pet taxi services to take your dog to the vet, groomer or any other place you would like us to take your pet within 10 miles radius. Your pet will be transported in an air-conditioned Honda Odyssey mini-van with plenty of room!North County Pet Sitting is fully licensed and insured. <br><br>We are offer pet taxi services in North County San Diego including Rancho Penasquitos, 4S Ranch, Santaluz, Rancho Santa Fe, Del Mar, Solana Beach, Carmel Mountain Ranch, Scripps Ranch, Poway, Mira Mesa and Carmel Valley. YES we can bring your pets to your wedding!"
			},{
			"title":"We are available on short notice!",
			"content":"If you need pet sitting or dog walking in less than 24 hours, please call me at (858) 200-6600. We are open 7 days a week!"
			}]
		};

/**
,{
			"title":"",
			"content":"
		}
//*/