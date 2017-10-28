$( document ).ready(
	function()
	{
		$( '#btn1').click( function(){
			$.post( "/btn1", {},
				function ( data )
				{
					if(data == "1")
					{
						$( '#error').val("Already occupied");
					}
					$( '#btn1' ).val( data );
				}
			 );
			 
		});
		$( '#btn2').click( function(){
			$.post( "/btn2", {},
				function ( data )
				{
					$( '#btn2' ).val( data );
				}
			 );
			 
		});

		$( '#btn3').click( function(){

			$.post( "/btn3", {},
				function ( data )
				{
					$( '#btn3' ).val( data );
				}
			 );
			 
		});

		$( '#btn4').click( function(){

			$.post( "/btn4", {},
				function ( data )
				{
					$( '#btn4' ).val( data );
				}
			 );
			 
		});

		$( '#btn5').click( function(){

			$.post( "/btn5", {},
				function ( data )
				{
					$( '#btn5' ).val( data );
				}
			 );
			 
		});

		$( '#btn6').click( function(){

			$.post( "/btn6", {},
				function ( data )
				{
					$( '#btn6' ).val( data );
				}
			 );
			 
		});

		$( '#btn7').click( function(){

			$.post( "/btn7", {},
				function ( data )
				{
					$( '#btn7' ).val( data );
				}
			 );
			 
		});

		$( '#btn8').click( function(){

			$.post( "/btn8", {},
				function ( data )
				{
					$( '#btn8' ).val( data );
				}
		 	);
			
		});

		$( '#btn9').click( function(){

			$.post( "/btn9", {},
				function ( data )
				{
					$( '#btn9' ).val( data );
				}
			 );
			 
		});

		$('#restartgame').click( function(){

			$.post( "/restartgame", {},
				function ( data )
				{
					$( '#btn1' ).val( data );
					$( '#btn2' ).val( data );
					$( '#btn3' ).val( data );
					$( '#btn4' ).val( data );
					$( '#btn5' ).val( data );
					$( '#btn6' ).val( data );
					$( '#btn7' ).val( data );
					$( '#btn8' ).val( data );
					$( '#btn9' ).val( data );
				}
			);
			
		});
	}
);