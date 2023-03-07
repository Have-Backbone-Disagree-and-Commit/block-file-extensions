//<script type="text/javascript">
$(document).ready(function () {

    // checkbox가 변경될 때마다 실행되는 함수
      $('input[type="checkbox"]').change(function() {
        console.log("111")
        var isChecked = $(this).is(':checked');
        console.log(isChecked)
        $.ajax({
          type: 'POST',
          url: '/test',
          data: {
            isChecked: isChecked
          },
          success: function(response) {
            console.log('체크박스 값이 업데이트되었습니다.');
          },
          error: function(e) {
            console.log('에러 발생:', e);
          }
        });
      });

    // 확장자 입력 후  [+추가] 버튼 클릭 시
    $('#btn_upload').click(function(){
      var inputVal = $('#input_extension').val();
      console.log(inputVal);
   });
})
//</script>
