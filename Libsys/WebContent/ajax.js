var xmlHttp

function showHint(str)
{
if (str.length==0)
{ 
document.getElementById("txtHint").innerHTML=""
return
}
xmlHttp=GetXmlHttpObject()
if (xmlHttp==null)
{
alert ("Browser does not support HTTP Request")
return
} 
var url="InputAction.do"
url=url+"?q="+str
url=url+"&sid="+Math.random()
xmlHttp.onreadystatechange=stateChanged 
xmlHttp.open("GET",url,true)
xmlHttp.send(null)
} 

function getBookList(str,str2)
{
if (str.length==0)
{ 
document.getElementById("txtHint").innerHTML=""
return
}
xmlHttp=GetXmlHttpObject()
if (xmlHttp==null)
{
alert ("Browser does not support HTTP Request")
return
} 
var url="ActionSimpleSearch.do";
xmlHttp.onreadystatechange=stateChanged; 
var params = 'f='+str+"&k="+str2;
//url=url+"&sid="+Math.random()
xmlHttp.open("POST", url, true);
xmlHttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
xmlHttp.setRequestHeader("Content-length", params.length);
xmlHttp.setRequestHeader("Connection", "close");
xmlHttp.send(params);
}


function getBookISBN(str)
{
if (str.length==0)
{ 
document.getElementById("txtHint").innerHTML=""
return
}
xmlHttp=GetXmlHttpObject()
if (xmlHttp==null)
{
alert ("Browser does not support HTTP Request")
return
} 
var url="ActionISBN.do";
xmlHttp.onreadystatechange=stateChanged; 
var params = 'k='+str;
//url=url+"&sid="+Math.random()
xmlHttp.open("POST", url, true);
xmlHttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
xmlHttp.setRequestHeader("Content-length", params.length);
xmlHttp.setRequestHeader("Connection", "close");
xmlHttp.send(params);
}


function getBookSimpleSearch(str,str2,str3)
{
if (str.length==0)
{ 
document.getElementById("txtHint").innerHTML=""
return
}
xmlHttp=GetXmlHttpObject()
if (xmlHttp==null)
{
alert ("Browser does not support HTTP Request")
return
} 
var url="ActionSearch.do";
xmlHttp.onreadystatechange=stateChanged; 
var params = 'f='+str+"&k="+str2+"&c="+str3;
//url=url+"&sid="+Math.random()
xmlHttp.open("POST", url, true);
xmlHttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
xmlHttp.setRequestHeader("Content-length", params.length);
xmlHttp.setRequestHeader("Connection", "close");
xmlHttp.send(params);
}

function getAditionalSearch1(form)
{
if (form==null)
{ 
document.getElementById("pane1").innerHTML=""
return
}
xmlHttp=GetXmlHttpObject()
if (xmlHttp==null)
{
alert ("Browser does not support HTTP Request")
return
} 
var url="setBranchDetails.php"
url=url+"?branch="+form.txtBranchName.value;
url=url+"&code="+form.txtBranchCode.value;
url=url+"&ano="+form.txtBranchAddressNo.value;
url=url+"&city="+form.txtBranchCity.value;
url=url+"&astreet="+form.txtBranchAddressStreet.value;
url=url+"&tp="+form.txtBranchTelephone.value;
url=url+"&odate="+form.txtBranchOpenDate.value;
//alert(url);
url=url+"&sid="+Math.random()
xmlHttp.onreadystatechange=stateChanged 
xmlHttp.open("GET",url,true)
xmlHttp.send(null)
}



function getAdvanceSearch(form)
{
if (form.keyword1.length==0)
{ 
document.getElementById("txtHint").innerHTML=""
return
}
xmlHttp=GetXmlHttpObject()
if (xmlHttp==null)
{
alert ("Browser does not support HTTP Request")
return
} 
var url="ActionAditionalSearch.do";
xmlHttp.onreadystatechange=stateChanged; 
var params = 'f1='+form.field1.value+"&k1="+form.keyword1.value+"&c1="+form.connector1.value+"&f2="+form.field2.value+"&k2="+form.keyword2.value+"&c2="+form.connector2.value +"&f3="+form.field3.value+"&k3="+form.keyword3.value+"&c3="+form.connector3.value   +"&c11="+form.connector11.value+"&c22="+form.connector22.value;
//url=url+"&sid="+Math.random()
xmlHttp.open("POST", url, true);
xmlHttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
xmlHttp.setRequestHeader("Content-length", params.length);
xmlHttp.setRequestHeader("Connection", "close");
xmlHttp.send(params);
}

function getLogin(str,str2)
{
if (str.length==0)
{ 
document.getElementById("txtlog").innerHTML=""
return
}
xmlHttp=GetXmlHttpObject()
if (xmlHttp==null)
{
alert ("Browser does not support HTTP Request")
return
} 
var url="ActionLogin";
xmlHttp.onreadystatechange=loginStateChanged; 
var params = 'u='+str+"&p="+str2;
//url=url+"&sid="+Math.random()
xmlHttp.open("POST", url, true);
xmlHttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
xmlHttp.setRequestHeader("Content-length", params.length);
xmlHttp.setRequestHeader("Connection", "close");
xmlHttp.send(params);
}


function loginStateChanged() 
{ 
if (xmlHttp.readyState==4 || xmlHttp.readyState=="complete")
{ 
document.getElementById("txtlog").innerHTML=xmlHttp.responseText 
} 
if (xmlHttp.readyState<4 || xmlHttp.readyState<"complete")
{ 
document.getElementById("txtlog").innerHTML="<center><img src='progress.gif' width='50' height='50'/></center>" 
}
}


function stateChanged() 
{ 
if (xmlHttp.readyState==4 || xmlHttp.readyState=="complete")
{ 
document.getElementById("txtHint").innerHTML=xmlHttp.responseText 
} 
if (xmlHttp.readyState<4 || xmlHttp.readyState<"complete")
{ 
document.getElementById("txtHint").innerHTML="<center><img src='progress.gif' width='50' height='50'/></center>" 
}
} 

function GetXmlHttpObject()
{ 
var objXMLHttp=null
if (window.XMLHttpRequest)
{
objXMLHttp=new XMLHttpRequest()
}
else if (window.ActiveXObject)
{
objXMLHttp=new ActiveXObject("Microsoft.XMLHTTP")
}
return objXMLHttp
} 





function win1()
{
  var win = new Window({id: "win1", className: "alphacube", title: "Sample", width:250, height:150, top:0, left: 1, parent:$('container')});
  win.getContent().innerHTML = "<h1>Constraint inside  a div !!</h1>constraint: {left:10, right:20}<br><a href='#' onclick='Windows.getWindow(\"win1\").maximize()'>Maximize me</a>";

  win.setDestroyOnClose();
  win.show();
  win.setConstraint(true, {left:10, right:20})
  win.toFront();
}

function win2()
{
  var win = new Window({id: "win2", className: "alphacube", title: "Sample", width:200, height:150});
  win.getContent().innerHTML = "<h1>Constraint inside page !!</h1>constraint: {top: 30, bottom:10}<br><a href='#' onclick='Windows.getWindow(\"win2\").maximize()'>Maximize me</a>";

  win.setDestroyOnClose();
  win.showCenter();
  win.setConstraint(true, {left:0, right:0, top: 30, bottom:10})
  win.toFront();
}

function win3()
{
  var win = new Window({id: "win3", className: "alphacube", title: "Help", width:450, height:150, wiredDrag: true});
  win.getContent().innerHTML = "<h1>Searching Tips</h1>"+
  " <h2>Field  	:</h2>  	 Select from the combo box the field on which the search is to be made.<br>"+
  " <h2>Keyword (Enter word(s) or phrase) :</h2>  	 Give the word(s) or phrase on the basis of which the search is to be made.<br>"+
  " <h2>Connector  	:</h2>  	 Select from the combo box the connector required between the search words."+
  " <h2><a href='#' onclick='Windows.getWindow(\"win3\").maximize()'>Maximize</a>";
  
  win.setDestroyOnClose();
  win.setLocation(300, 270);
  win.show();
  win.toFront();
}





    function openBlackConfirm() {
  var win = new Window({className: "dialog",  width:350, height:400, zIndex: 100, resizable: true, title: "sankadilmadu@gmail.com", showEffect:Effect.BlindDown, hideEffect: Effect.SwitchOff, draggable:true, wiredDrag: true})

win.getContent().innerHTML= "<div style='padding:10px'>  sankadilmadu@gmail.com \
this shloud be with all library.\
Lor sum amet, commy nulputat. Duipit lum ipisl eros dolortionsed tin hent aliquis illam volor in ea feum in ut adipsustrud elent ulluptat. Duisl ullan ex et am vulputem augiam doloreet amet enibh eui te dipit acillutat acilis amet, suscil er iuscilla con utat,  bla feummy.</div>"
win.setStatusBar("Status bar info");
win.showCenter();  
}

function openGreenConfirm() {
var win = new Window({className: "spread", title: "Ruby on Rails", 
                      top:70, left:100, width:300, height:200, 
                      url: "http://www.rubyonrails.org/", showEffectOptions: {duration:1.5}})
win.show();   
}

function openAlertConfirm() {
Dialog.alert("Test of alert panel, check out debug window after closing it", 
             {width:300, height:100, okLabel: "close", 
              ok:function(win) {debug("validate alert panel"); return true;}});
 }       




	 function displayVals() {
			 var firstName = $("uName").value;
			 var lastName =$("pWord").value;
			 var ret= false;
				if(firstName!="" && lastName!="")
				{
					//alert("username : "+firstName+"password : "+lastName);
					getLogin(firstName,lastName);
					ret= true;
				}
				else{
				$('login_error_msg').innerHTML='Login or password inccorect';					
					ret=false;
				}
			return ret;
	    }
	 
 
 
function openLogin() {
Dialog.confirm($('login').innerHTML, {className:"alphacube", width:400, 
                                      okLabel: "login", cancelLabel: "cancel",
                                      onOk:function(win){ 
							  		if(displayVals()){
										return true;
											 }
									else {                                      
                                        $('login_error_msg').innerHTML='Login or password inccorect';
                                        $('login_error_msg').show(); 
                                        Windows.focusedWindow.updateHeight();
                                        new Effect.Shake(Windows.focusedWindow.getId()); return false;}}});
          
}
 
 