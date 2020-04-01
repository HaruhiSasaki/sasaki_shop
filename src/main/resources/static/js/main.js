$(function() {
	$('#shinki').hide();
	$('#kekka').hide();

//ーーーーーーーラジオボタン操作-------------//
    $('#a').on('click', () => {
        $('#kensaku').show();
    });

    $('#a').on('click', () => {
        $('#shinki').hide();
    });

    $('#b').on('click', () => {
        $('#shinki').show();
    });

    $('#b').on('click', () => {
        $('#kensaku').hide();
    });

//--------------------------------------//

//検索ボタン
    $('#MakerSearch').on('click', () => {
        $('#kekka').show();
    });



 });


