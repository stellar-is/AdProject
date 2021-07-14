package com.stellar.myproject.mappers;

import com.stellar.myproject.entity.Channels;
import com.stellar.myproject.entity.dto.ChannelsDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import java.util.List;
@Mapper
public interface ChannelsMapper {
ChannelsMapper INSTANCE  = Mappers.getMapper(ChannelsMapper.class);
ChannelsDto channelsToChannelsDto(Channels channel);
Channels channelsDtoToChannels(ChannelsDto channelDto);
List<ChannelsDto> channelsListToChannelsDtoList(List<Channels>channels);
List<Channels> channelsDtoListToChannelsList(List<ChannelsDto>channelsDto);


}
